<!-- <div ng-controller="ForumController">

Forum Name<input type="text" ng-model="forum.forumName"/>

<br/><br/>

Forum Content<textarea ng-model="forum.forumContent"></textarea>

<br/><br/>

<button ng-click="addForum()">Add Forum</button>
</div>
 -->



<!DOCTYPE html>
<html>
<title>W3.CSS Template</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet" type="text/css">
<style>
body {font-family: "Raleway", Arial, sans-serif}
.w3-row img {margin-bottom: -8px}
h1 {
    text-shadow: 3px 3px #FF0000;
    text-align: center;
}
</style>
<body>


<div class="w3-content" style="max-width:1500px">

  <h1>Add Forum</h1>
  <div class="w3-row">
    <div class="w3-half">
      <img src="images/forum.png" style="width:100%">
      <img src="images/f1.PNG" style="width:100%">
      
    </div>

    <div class="w3-half">
      <img src="images/f2.PNG" style="width:100%">
    </div>
  </div>
  

</div>

<br/><br/>


<div ng-controller="ForumController">

Forum Name<input type="text" ng-model="forum.forumName"/>

<br/><br/>

Forum Content<textarea ng-model="forum.forumContent"></textarea>

<br/><br/>

<button ng-click="addForum()">Add Forum</button>
</div>
 
</body>
</html>
