package net.ezra.navigation

//import net.ezra.ui.auth.SignupScreen
import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignUpScreen
import net.ezra.ui.dashboard.DashboardScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.products.AddProductScreen
import net.ezra.ui.products.ProductDetailScreen
import net.ezra.ui.products.ProductListScreen
import net.ezra.ui.screens.ChinaScreen
import net.ezra.ui.screens.ColaScreen
import net.ezra.ui.screens.FavoriteScreen
import net.ezra.ui.screens.FloridaScreen
import net.ezra.ui.screens.HawaiiScreen
import net.ezra.ui.screens.MaldivesScreen
import net.ezra.ui.screens.MombasaScreen
import net.ezra.ui.screens.MoroccanScreen
import net.ezra.ui.screens.PandawaScreen
import net.ezra.ui.screens.SanurScreen
import net.ezra.ui.screens.SychellesScreen
import net.ezra.ui.students.AddStudents
import net.ezra.ui.students.Search
import net.ezra.ui.students.Students

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_HOME


) {


    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }


        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }

        composable(ROUTE_VIEW_STUDENTS) {
           Students(navController = navController, viewModel = viewModel() )
        }

        composable(ROUTE_SEARCH) {
            Search(navController)
        }

        composable(ROUTE_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUTE_REGISTER) {
           SignUpScreen(navController = navController) {

           }
        }

        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController){}
        }

        composable(ROUTE_MOMBASA) {
            MombasaScreen(navController = navController)
        }

        composable(ROUTE_PANDAWA) {
            PandawaScreen(navController = navController)
        }

        composable(ROUTE_FLORIDA) {
            FloridaScreen(navController = navController)
        }

        composable(ROUTE_MALDIVES) {
            MaldivesScreen(navController = navController)
        }

        composable(ROUTE_SYCHELLES) {
            SychellesScreen(navController = navController)
        }

        composable(ROUTE_MOROCCAN) {
            MoroccanScreen(navController = navController)
        }

        composable(ROUTE_HAWAII) {
            HawaiiScreen(navController = navController)
        }

        composable(ROUTE_COLA) {
            ColaScreen(navController = navController)
        }

        composable(ROUTE_FAVORITE) {
            FavoriteScreen(navController = navController)
        }

        composable(ROUTE_CHINA) {
            ChinaScreen(navController = navController)
        }

        composable(ROUTE_SANUR) {
            SanurScreen(navController = navController)
        }

        composable(ROUTE_ADD_PRODUCT) {
            AddProductScreen(navController = navController){}
        }

        composable(ROUTE_VIEW_PROD) {
            ProductListScreen(navController = navController, products = listOf() )
        }



        composable("productDetail/{productId}") { backStackEntry ->
            val productId = backStackEntry.arguments?.getString("productId") ?: ""
            ProductDetailScreen(navController, productId)
        }









































    }
}