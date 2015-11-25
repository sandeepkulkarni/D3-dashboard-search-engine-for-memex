angular.module('app.controllers', [])
	.controller('PageViewController', ['$scope', '$route', '$animate', function($scope, $route, $animate) {
	}])
	.controller('HomeworkAppController', ['$scope', function($scope) {
	}])

	.controller('Query1Controller', ['$scope', function($scope) {
		$scope.today = function() {
			$scope.dt = new Date();
		};
		$scope.today();

		$scope.clear = function () {
			$scope.dt = null;
		};
		$scope.toggleMin = function() {
			$scope.minDate = $scope.minDate ? null : new Date('1970-1-1');
		};
		$scope.toggleMin();

		$scope.open = function($event) {
			$event.preventDefault();
			$event.stopPropagation();
			$scope.opened = true;
		};

		$scope.dateOptions = {
			formatYear: 'yy',
			startingDay: 1
		};

		$scope.initDate = new Date();
		$scope.formats = ['dd-MMMM-yyyy', 'yyyy/MM/dd', 'dd.MM.yyyy', 'shortDate'];
		$scope.format = $scope.formats[0];

	}]);
;
