<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Goods Management</title>
</head>
<body align=center>
<h1>荐免 前格 包府</h1>
<table align=center border=1>
<tr><td>Country</td><td><input type=text id=country><input type=hidden id=opflag></td></tr>
<tr><td>Seq No.</td><td><input type=text id=seqno></td></tr>
<tr><td>Good name</td><td><input type=text id=goodname></td></tr>
<tr><td colspan=2 align=center>
	<input type=button id=btnAddnew value=AddNew>
	<input type=button id=btnReset value=厚快扁></td></tr>
</table><br>
<table id=tblData border=1 align=center>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	loadDataJson();
})
.on('click','#btnAddnew',function(){
	$.ajax({
			type:'get',
			url:'addgood',
			data: {country:$('#country').val(),seqno:$('#seqno').val(),goodname:$('#goodname').val()},
			dataType:'text',
			success:function(){
				loadData();
				$('#country,#seqno,#goodname').val('')
			}
	})
})
.on('click','#btnReset',function(){
	$('#country,#seqno,#goodname').val('');
})
.on('click','#tblData tr', function(){
	country = $(this).find('td:eq(0)').text();
	seqno = $(this).find('td:eq(1)').text();
	goodname = $(this).find('td:eq(2)').text();
	$('#country').val(country);
	$('#seqno').val(seqno);
	$('#goodname').val(goodname);
	$('#btnAddnew').val('Update');
})
.on('click','#btnReset',function(){
	$('#country, #seqno, #goodname').val('')
//	$('#btnAddnew').val('AddNew')
})
.on('click','#btndelete',function(){
	$.ajax({
		type:'get',
		url:'delete',
		data: {country:$(this).parent().parent().find('td:eq(0)').text(),
			seqno:$(this).parent().parent().find('td:eq(1)').text(),
			goodname:$(this).parent().parent().find('td:eq(2)').text()},
		dataType:'text',
		success:function(){
			loadData();
			$('#btnReset').trigger('click');
		}
	})
})

function loadData(){
	$.ajax({
		type:'get',url:'homelist',data:'',dataType:'text',
		success:function(data){
			$('#tblData').empty().append(data);
		}
	})
}
function loadDataJson(){
	$.ajax({
		type:'get',url:'homelist',dataType:'json',
		success:function(data){
			$('#tblData').empty();
			console.log(data)
			for(let i=0; i<data.length; i++){
				let jo = data[i];
				let str = '<tr><td>'+jo['country']+'</td><td>'
				+jo['seqno']+'</td><td>'+jo['goodname']+'</td></tr>'
				$('#tblData').append(str);
			}
		}
	})
}

</script>
</html>