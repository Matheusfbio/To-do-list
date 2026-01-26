package com.br.todolist.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.br.todolist.ui.feature.addedit.AddEditScreen
import com.br.todolist.ui.feature.list.ListScreen
import kotlinx.serialization.Serializable

@Serializable
object ListRouter

@Serializable
data class AddEditRouter(val id: Long? = null)

@Composable
fun TodoNavHost() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ListRouter){
        composable<ListRouter> {
            ListScreen(
            navigateToAddEditScreen = { id ->
                navController.navigate(AddEditRouter(id = id))}
        ) }

        composable<AddEditRouter> {backStackEntry ->
            val addEditRouter = backStackEntry.toRoute<AddEditRouter>()
            AddEditScreen(
                id = addEditRouter.id,
                navigateBack = {
                    navController.popBackStack()
                }
            )
        }
    }
}