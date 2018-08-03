<!-- <div class="container" ng-controller="FriendController">
<table width="80%" align="center">
<tr bgcolor="orange">
<td colspan="3">Friend List</td>
</tr>
<tr bgcolor="gray" ng-repeat="friend in showFriendList">
<td>
 	<img ng-hide="friend.friendloginname==currentUser.loginname" src="http://localhost:8081/SocialHubMiddleware/getImage/{{friend.friendloginname}}" width="40" height="40"/>
 	<img ng-hide="friend.loginname==currentUser.loginname" src="http://localhost:8081/SocialHubMiddleware/getImage/{{friend.loginname}}" width="40" height="40"/>
 </td>
 <td>
 <span ng-hide="friend.friendloginname==currentUser.loginname">{{friend.friendloginname}}</span>
 <span ng-hide="friend.loginname==currentUser.loginname">{{friend.loginname}}</span>
 </td>
 <td><button class="btn btn-danger" ng-click="unfriend(friend)">UnFriend</button>
 </td></tr>
</table>
</div> -->



<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
h1 {
    text-shadow: 3px 3px #FF0000;
    text-align: center;
}
</style>
<body>

<div class="container">
  <h1>Show Friend List</h1>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="images/c1.PNG" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="images/c2.PNG" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="images/c3.PNG" alt="New York" style="width:100%;">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
</br> </br>
<div class="container" ng-controller="FriendController">
<table width="80%" align="center">
<tr bgcolor="orange">
<td colspan="3">Friend List</td>
</tr>
<tr bgcolor="gray" ng-repeat="friend in showFriendList">
<td>
 	<img ng-hide="friend.friendloginname==currentUser.loginname" src="http://localhost:8081/SocialHubMiddleware/getImage/{{friend.friendloginname}}" width="40" height="40"/>
 	<img ng-hide="friend.loginname==currentUser.loginname" src="http://localhost:8081/SocialHubMiddleware/getImage/{{friend.loginname}}" width="40" height="40"/>
 </td>
 <td>
 <span ng-hide="friend.friendloginname==currentUser.loginname">{{friend.friendloginname}}</span>
 <span ng-hide="friend.loginname==currentUser.loginname">{{friend.loginname}}</span>
 </td>
 <td><button class="btn btn-danger" ng-click="unfriend(friend)">UnFriend</button>
 </td></tr>
</table>
</div>

</body>
</html>
