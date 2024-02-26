<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
   <title>지도테스트</title>
</head>
<body>
<h1>
지도테스트  
</h1>
<div id="map" style="width:500px;height:500px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=347519ef94e97bbc72e4098cfdd006f1"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
    mapOption = { 
        center: new kakao.maps.LatLng(37.57986, 126.97711), // 경복궁 중심좌표
        //center: new kakao.maps.LatLng( 37.578758, 126.995310), // 창경궁 중심좌표
        //center: new kakao.maps.LatLng(37.579032, 126.991012), // 창덕궁 중심좌표
        //center: new kakao.maps.LatLng(37.565824, 126.97521699999993), // 덕수궁 중심좌표
        //center: new kakao.maps.LatLng(37.574574, 126.994143), // 종묘 중심좌표
        
        level: 3 // 지도의 확대 레벨
    };

// 지도를 표시할 div와  지도 옵션으로  지도를 생성합니다
var map = new kakao.maps.Map(mapContainer, mapOption); 

var marker = new kakao.maps.Marker({ 
    // 지도 중심좌표에 마커를 생성합니다 
    position: map.getCenter() 
}); 
// 지도에 마커를 표시합니다
marker.setMap(map);
</script>
</body>
</html>