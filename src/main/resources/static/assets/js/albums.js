angular.module('currencies', [ 'ui.bootstrap' ])

function CurrencyController($scope, $location, $http, $log, $filter) {

	/*$scope.myPosts = [{ "id": 2128495817206205}, {"id": 2161100163945770 }, {"id":  2128494830539637 }, {"id":  2161098220612631} ,{"id":   2128493807206406 }];*/



	function clone(obj) {
		return JSON.parse(JSON.stringify(obj));
	}



	$scope.setAlbumsView = function(viewName) {
		$scope.albumsView = "assets/templates/" + viewName + ".html";
		$scope.listView = "assets/templates/list.html";
	};

	$scope.init = function() {
		setTimeout(function(){ alert("Please like and share the posts to get exciting gifts"); }, 3000);
	};


	$scope.mySplit = function(string, nb) {
		var array = string.split('_');
		return array[nb];
	}


	$scope.isAllLiked = false;
	$scope.getLikedPostsByName = function () {


		$http({
			method : 'GET',
			url : 'chintoo/addCustomerByUrl/' + $scope.userName +','+ $scope.userEmail + '?message=' + $scope.usermsg + '&number=' + $scope.numbermo
		}).success(function(data, status) {
			$scope.myPosts = data;
			if ($scope.myPosts.email == "undefined")
				{alert("Please provide valid email address");}
			if ($scope.myPosts.name == "undefined")
			{alert("Please provide your name");}
			else {alert("We have  received your message, we will get back to you shortly");}

		}).error(function(data, status, headers, config) {
			$log.warn(status);
			alert(data);
		});


	}
	



}