<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="robots" content="noindex,nofollow"/>
    <?php if($device_type != 3):?>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="pragma" content="no-cache" />
    <meta name="apple-mobile-web-app-capable" content="no" />
    <meta name="apple-mobile-web-app-status-bar-style" content="black" />
    <?php endif?>
    <title><?=$titleName;?></title>
    <link rel="stylesheet" href="css/topmenu.css" />
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
    <script src="http://code.jquery.com/jquery.min.js" ></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <!--[if lt IE 9]> <!-- 5. 인터넷익스플로러 9버전 이하일 경우 html5가 인식될 수 있게 해주는 스크립트 -->
    <script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <script src="bootstrap/js/respond.min.js"></script>
    <script src="js/login.js"></script>
    <script type="text/javascript">
        var currentName = null;
        $(document).ready(function(){
            tabSetting(); // 탭 초기화 및 설정
        });

        function tabSetting() {
            $('.tabPage').hide();
            $('#navbar-collapse-2 a').on('click', function() {
                var tabName = $(this).attr('href');
                if(currentName != tabName){
                    $('.tabPage').hide();
                    currentName = tabName;
                }
                if($(tabName).is(":visible")){
                    //$(tabName).slideUp();
                    $(tabName).toggle();
                }else{                    
                    $(tabName).slideDown();
                }

                if(tabName != '#nav-loginForm'){ // 로그인 창이 아니면
                    // 반응형으로 메뉴 동작시 메뉴 클릭후 자동 숨김
                    $('#navbar-collapse-2').collapse('hide');
                }
            });
            
            $('.side-menu-container a').on('click', function() {
                var tabName = $(this).attr('href');
                if(currentName != tabName){
                    $('.tabPage').hide();
                    currentName = tabName;
                }
                if($(tabName).is(":visible")){
                    //$(tabName).slideUp();
                    $(tabName).toggle();
                }else{                    
                    $(tabName).slideDown();
                }
            });
        }

    </script>
</head>
<body>

출처: https://link2me.tistory.com/1184 [소소한 일상 및 업무TIP 다루기]