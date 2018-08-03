myModule.controller("FriendController",function($scope,$http,$rootScope,$location)
{
	$scope.user={'loginname':'','password':'','username':'','emailid':'','mobile':'','role':'','address':''};
	
	$scope.friend={'friendId':0,'loginname':'','friendloginname':'','status':''};
	
	$scope.showFriendList;
	
	$scope.showSuggestedFriendList;
	
	$scope.showPendingFriendRequestList;
	
	
	$scope.unfriend=function(friend)
	{
		$http.get('http://localhost:8081/SocialHubMiddleware/deleteFriendRequest/'+friend.friendId)
		.then(function(response)
		{
			console.log("Friend Deleted");
		});
	}
	
	$scope.acceptfriend=function(friend)
	{
		$http.get('http://localhost:8081/SocialHubMiddleware/acceptFriendRequest/'+friend.friendId)
		.then(function(response)
		{
			console.log("Accepted Friend Request");
		});
	}
	
	$scope.sendFriendRequest=function(friend)
	{
		$scope.friend.loginname=$rootScope.currentUser.loginname;
		$scope.friend.friendloginname=friend.loginname;
		$scope.friend.status='NA';
		$http.post('http://localhost:8081/SocialHubMiddleware/sendFriendRequest/',$scope.friend)
		.then(function(response)
		{
			console.log("Friend Request Sent");
		});
	}
	
	function showFriendList()
	{
		$http.get('http://localhost:8081/SocialHubMiddleware/showFriendList/'+$rootScope.currentUser.loginname)
		.then(function(response)
		{
			$scope.showFriendList=response.data;
	
		});
	}
	
	function showSuggestedFriendLists()
	{
		$http.get('http://localhost:8081/SocialHubMiddleware/showSuggestedFriendList/'+$rootScope.currentUser.loginname)
		.then(function(response)
		{
			$scope.showSuggestedFriendList=response.data;
	
		});
	}
	
	function showPendingFriendRequestList()
	{
		$http.get('http://localhost:8081/SocialHubMiddleware/showPendingFriendRequest/'+$rootScope.currentUser.loginname)
		.then(function(response)
		{
			$scope.showPendingFriendRequestList=response.data;
	
		});
	};
	showFriendList();
	showSuggestedFriendLists();
	showPendingFriendRequestList();
	});