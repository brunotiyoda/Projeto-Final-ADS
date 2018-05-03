'use strict';

angular.module('empresa', ['ngRoute'])
    .config(['$routeProvider', '$locationProvider',
        function ($routeProvider, $locationProvider) {

            $routeProvider
                .when('/dashboard', {
                    templateUrl: '/empresa/dashboard/dashboard.html',
                    controller: 'DashboardController'
                })
                .when('/pesquisa/cargo', {
                    templateUrl: '/sys/estado/pesquisa_estado.html',
                    controller: 'PesquisaEstadoController'
                })
                .when('/cadastro/departamento', {
                    templateUrl: '/sys/estado/cadastro_estado.html',
                    controller: 'EstadoController'
                })

                .when('/pesquisa/colaborador', {
                    templateUrl: '/sys/cidade/pesquisa_cidade.html',
                    controller: 'PesquisaCidadeController'
                });

            //$locationProvider.html5Mode(true);
        }]);