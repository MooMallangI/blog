<%@ page language="java" contentType="text/html; charset=UTF-8"%>
	
<style>

.floating-menu{
	border-radius:100px;
	z-index:999;
	padding-top:10px;
	padding-bottom:10px;
	left:82%;
	position:fixed;
	display:inline-block;
	top:92%;
	-webkit-transform:translateY(-50%);
	-ms-transform:translateY(-50%);
	transform:translateY(-50%)
}
.main-menu{
	margin:0;
	padding-left:0;
	list-style:none
}

.main-menu li a{
	display:block;
	padding:20px;
	color:#626263;
	border-radius:50px;
	position:relative;
	-webkit-transition:none;
	-o-transition:none;transition:none
}

.main-menu li a:hover{
	background:rgba(244,244,244,.3)
}

.menu-bg{
	position:absolute;
	width:100%;
	height:100%;
	border-radius:50px;
	z-index:-1;
	top:0;
	left:0;
	-webkit-transition:.1s;
	-o-transition:.1s;
	transition:.1s
}

.ripple{
	position:relative;
	overflow:hidden;
	transform:translate3d(0,0,0)
}

.ripple:after{
	content:"";
	display:block;
	position:absolute;
	width:100%;
	height:100%;
	top:0;
	left:0;
	pointer-events:none;
	background-image:radial-gradient(circle,#000 10%,transparent 10.01%);
	background-repeat:no-repeat;
	background-position:50%;
	transform:scale(10,10);
	opacity:0;
	transition:transform .5s,opacity 1s
}.ripple:active:after{transform:scale(0,0);opacity:.2;transition:0s}
	
</style>

<nav class="floating-menu">
	<ul class="main-menu">
	    <li>
	        <a href="javascript:goTop();" class="ripple">
	            <i class="fa fa-chevron-up fa-lg"></i>
	        </a>
	    </li>
	    <li>
	        <a href="javascript:goBottom();" class="ripple">
	            <i class="fa fa-chevron-down fa-lg"></i>
	        </a>
	    </li>
	</ul>
	<div class="menu-bg"></div>
</nav>

<script>
goTop = function(){
	$('html, body').scrollTop(0);
}

goBottom = function(){
	$('html, body').scrollTop( $(document).height() );
}

</script>