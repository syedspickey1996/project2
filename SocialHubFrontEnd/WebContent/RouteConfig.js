var myModule=angular.module("MyModule",['ngRoute','ngCookies']);

myModule.config(function ($routeProvider)
		{
		
		alert('I am in Route Config');
		$routeProvider.when("/",{templateUrl:"/index.html"})
					 .when("/login",{templateUrl:"c_user/Login.html"})
					 .when("/register",{templateUrl:"c_user/Register.jsp"})
		             .when("/contactus",{templateUrl:"c_pages/ContactUs.html"})
		             .when("/aboutus",{templateUrl:"c_pages/AboutUs.html"})
					 .when("/UserHome",{templateUrl:"c_pages/UserHome.html"})
					 .when("/addBlog",{templateUrl:"c_blog/AddBlog.jsp"})
					 .when("/showBlog",{templateUrl:"c_blog/ShowBlog.html"})
					 .when("/adminBlog",{templateUrl:"c_blog/AdminBlog.html"})
					 .when("/blogComment",{templateUrl:"c_blog/BlogComment.html"})
					 .when("/addForum",{templateUrl:"c_forum/AddForum.jsp"})
					 .when("/showForum",{templateUrl:"c_forum/ShowForum.html"})
					 .when("/adminForum",{templateUrl:"c_forum/AdminForum.html"})
					 .when("/forumComment",{templateUrl:"c_forum/ForumComment.jsp"})
					 .when("/profilePic",{templateUrl:"c_user/ProfilePictureUpdate.html"})
					 .when("/showFriendList",{templateUrl:"c_friend/ShowFriendList.jsp"})
					 .when("/showPendingFriendRequestList",{templateUrl:"c_friend/ShowPendingFriendRequestList.jsp"})
					 .when("/showSuggestedFriendList",{templateUrl:"c_friend/ShowSuggestedFriendList.jsp"})
					 .when("/chat",{templateUrl:"c_chat/Chat.html"});
		});
myModule.run(function($rootScope,$cookieStore)
		{
		console.log('I am in run function');
		console.log($rootScope.currentUser);
		if($rootScope.currentUser==undefined)
			{
			$rootScope.currentUser=$cookieStore.get('userDetails');
			}
});