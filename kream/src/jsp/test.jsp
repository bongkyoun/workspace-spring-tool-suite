<%@page import="com.itwill.dto.ProductDetail"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
<title>QNA</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
    $("#writeBtn").click(function(){
    	location.href ="write";
    })
    $.ajax({
    	url: "test", 
    	success: function(result){             
        console.log(result);
        console.log(result.pd_no);
        console.log(result.productsize.ps_no);
        console.log(result.productsize.product.p_price);
    	}
    	
    })
    });

</script>
</head>
<body>
asdsa

${product}
${product.pd_no}
${product.pd_price}
${product.productSize.ps_no}

</body>
</html>