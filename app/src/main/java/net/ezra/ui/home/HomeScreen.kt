package net.ezra.ui.home






//noinspection UsingMaterialAndMaterial3Libraries
//noinspection UsingMaterialAndMaterial3Libraries
import android.annotation.SuppressLint
import android.content.Intent
import androidx.activity.compose.ManagedActivityResultLauncher
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.ezra.R
import net.ezra.navigation.ROUTE_CHINA
import net.ezra.navigation.ROUTE_COLA
import net.ezra.navigation.ROUTE_FLORIDA
import net.ezra.navigation.ROUTE_HAWAII
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MALDIVES
import net.ezra.navigation.ROUTE_MOMBASA
import net.ezra.navigation.ROUTE_MOROCCAN
import net.ezra.navigation.ROUTE_PANDAWA
import net.ezra.navigation.ROUTE_SANUR
import net.ezra.navigation.ROUTE_SYCHELLES
import net.ezra.navigation.ROUTE_VIEW_PROD


data class Screen(val title: String, val icon: Int)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ResourceAsColor")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    var isDrawerOpen by remember { mutableStateOf(false) }

    val callLauncher: ManagedActivityResultLauncher<Intent, ActivityResult> =
        rememberLauncherForActivityResult(contract = ActivityResultContracts.StartActivityForResult()) { _ ->

        }

    var search by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Scaffold(
        /*
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.apen))
                },
                /*
                navigationIcon = @Composable {
                    if (!isDrawerOpen) {
                        IconButton(onClick = { isDrawerOpen = true }) {
                            Icon(
                                Icons.Default.Menu,
                                contentDescription = "Menu",
                                tint = Color.White
                                )
                        }
                    }
                },
                 */

                actions = {
                    IconButton(onClick = {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }

                    }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = null,
                            tint = Color.White
                        )
                    }
                },

                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFFDDA90E),
                    titleContentColor = Color.White,

                )

            )
        },
        */


        content =
        @Composable
        {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
            ,
        ) {
            item {
                Column {
                    Row(

                    ) {
                        Text(text = " Hi, Adventurer!", fontWeight = FontWeight.Light, fontSize = 12.sp)

                        Spacer(modifier = Modifier.width(230.dp))

                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = "",
                            modifier = Modifier
                                .size(20.dp),

                            )
                    }

                    Row {
                        Text(text = " Where are you going?", fontWeight = FontWeight.Bold)

                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Column {
                        Text(text = " Explore", fontWeight = FontWeight.Bold, fontSize = 20.sp)

                        Spacer(modifier = Modifier.height(3.dp))

                        Text(text = "  We hope you find what you", fontWeight = FontWeight.Light, fontSize = 15.sp)

                        Text(text = "  came for", fontWeight = FontWeight.Light, fontSize = 15.sp)


                    }

                    
                    Spacer(modifier = Modifier.height(10.dp))


                    Row {

                        Text(text = " Popular Beach", fontWeight = FontWeight.Bold)


                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        

                        Spacer(modifier = Modifier.width(5.dp))

                    Card(

                        shape = RoundedCornerShape(15.dp),
                        modifier = Modifier
                            .size(170.dp)
                            .clickable {
                                navController.navigate(ROUTE_MOMBASA) {
                                    popUpTo(ROUTE_HOME) { inclusive = true }
                                }
                            }
                        ,

                        elevation = 5.dp

                        ) {
                        Box(
                            modifier = Modifier
                                .height(200.dp),
                        ) {
                            Image(
                                modifier = Modifier
                                .size(170.dp),
                                painter = painterResource(id = R.drawable.kbeach),
                                contentDescription = "",
                                contentScale = ContentScale.Crop
                                )
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(
                                                Color.Transparent,
                                                Color.Black
                                            ),
                                            startY = 300f
                                        )
                                    )

                                ,

                            ) {

                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(12.dp),
                                contentAlignment = Alignment.BottomCenter
                            ) {
                                Text(text = "Mombasa Beach", color = Color.White)
                            }

                        }



                    }
                        
                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .size(170.dp)
                                .clickable {
                                    navController.navigate(ROUTE_SANUR) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }
                            ,
                            elevation = 5.dp
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp)
                                ,
                            ) {
                                Image(
                                    modifier = Modifier
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.sbeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )
                                    ,


                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp)
                                    ,
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "Sanur Beach", color = Color.White)
                                }



                            }

                        }





                }

                    Spacer(modifier = Modifier.height(5.dp))

                    Spacer(modifier = Modifier.width(5.dp))

                    Row {

                        Spacer(modifier = Modifier.width(5.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_PANDAWA) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }
                                .size(170.dp)
                            ,
                            elevation = 5.dp

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp),
                            ) {
                                Image(
                                    modifier = Modifier
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.pbeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )

                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp),
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "Pandawa Beach", color = Color.White)
                                }


                            }


                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_FLORIDA) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }
                                .size(170.dp)
                            ,
                            elevation = 5.dp

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp),
                            ) {
                                Image(
                                    modifier = Modifier
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.fbeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )

                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp),
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "Florida Beach", color = Color.White)
                                }


                            }


                        }

                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Row {

                        Spacer(modifier = Modifier.width(5.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_MALDIVES) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }
                                .size(170.dp)
                            ,
                            elevation = 5.dp

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp),
                            ) {
                                Image(
                                    modifier = Modifier
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.malbeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )

                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp),
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "Maldives Beach", color = Color.White)
                                }


                            }


                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .size(170.dp)
                            ,
                            elevation = 5.dp

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp),
                            ) {
                                Image(
                                    modifier = Modifier
                                        .clickable {
                                            navController.navigate(ROUTE_SYCHELLES) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.abeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )

                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp),
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "Sychelles Beach", color = Color.White)
                                }


                            }


                        }

                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Row {

                        Spacer(modifier = Modifier.width(5.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .size(170.dp)
                            ,
                            elevation = 5.dp

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp),
                            ) {
                                Image(
                                    modifier = Modifier
                                        .clickable {
                                            navController.navigate(ROUTE_HAWAII) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.hbeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )

                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp),
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "Hawaii Beach", color = Color.White)
                                }


                            }


                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_MOROCCAN) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                }
                                .size(170.dp)
                            ,
                            elevation = 5.dp

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp),
                            ) {
                                Image(
                                    modifier = Modifier
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.mobeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )

                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp),
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "Moroccan Beach", color = Color.White)
                                }


                            }


                        }

                    }

                    Spacer(modifier = Modifier.height(5.dp))

                    Row {

                        Spacer(modifier = Modifier.width(5.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .size(170.dp)
                            ,
                            elevation = 5.dp

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp),
                            ) {
                                Image(
                                    modifier = Modifier
                                        .clickable {
                                            navController.navigate(ROUTE_CHINA) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.chibeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )

                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp),
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "China Beach", color = Color.White)
                                }


                            }


                        }

                        Spacer(modifier = Modifier.width(10.dp))

                        Card(
                            shape = RoundedCornerShape(15.dp),
                            modifier = Modifier
                                .size(170.dp)
                            ,
                            elevation = 5.dp

                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp),
                            ) {
                                Image(
                                    modifier = Modifier
                                        .clickable {
                                            navController.navigate(ROUTE_COLA) {
                                                popUpTo(ROUTE_HOME) { inclusive = true }
                                            }
                                        }
                                        .size(170.dp),
                                    painter = painterResource(id = R.drawable.cobeach),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .background(
                                            Brush.verticalGradient(
                                                colors = listOf(
                                                    Color.Transparent,
                                                    Color.Black
                                                ),
                                                startY = 300f
                                            )
                                        )

                                ) {

                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .padding(12.dp),
                                    contentAlignment = Alignment.BottomCenter
                                ) {
                                    Text(text = "Cola Beach", color = Color.White)
                                }


                            }


                        }



                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Button(
                        colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF0B3FC0)),
                        onClick = {
                        navController.navigate(ROUTE_VIEW_PROD) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    },
                        shape = RoundedCornerShape(50.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(50.dp),
                        ) {
                        Text(text = "MORE HERE", fontSize = 18.sp, textAlign = TextAlign.Center)
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Button(onClick = {
                        navController.navigate(ROUTE_LOGIN) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    },
                        shape = RoundedCornerShape(50.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(50.dp),
                    ) {
                        Text(text = "LOGIN", fontSize = 18.sp, textAlign = TextAlign.Center)
                    }

                    Spacer(modifier = Modifier.height(5.dp))

                  /*  Button(
                        onClick = {  //Temporal button to add destinations
                        navController.navigate(ROUTE_ADD_PRODUCT) {
                            popUpTo(ROUTE_HOME) { inclusive = true }
                        }
                    },
                        shape = RoundedCornerShape(50.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .height(50.dp),
                    ) {
                        Text(text = "", fontSize = 18.sp, textAlign = TextAlign.Center)
                    }
                    */
































                }



            }


        }


















        },



      //  bottomBar = {BottomBar(navController = navController) }







    )

    //AnimatedDrawer(
       // isOpen = isDrawerOpen,
       // onClose = { isDrawerOpen = false }
 //   )
}

@Composable
fun AnimatedDrawer(isOpen: Boolean, onClose: () -> Unit) {
    val drawerWidth = remember { Animatable(if (isOpen) 250f else 0f) }

    LaunchedEffect(isOpen) {
        drawerWidth.animateTo(if (isOpen) 250f else 0f, animationSpec = tween(durationMillis = 300))
    }

    Surface(
        modifier = Modifier
            .fillMaxHeight()
            .width(drawerWidth.value.dp)
            ,
        color = Color.LightGray,
//        elevation = 16.dp
    ) {
        Column {
            Text(
                text = "Drawer Item 1"

            )
            Text(
                text = "Drawer Item 2"
            )
            Text(
                text = "Drawer Item 3",
                modifier = Modifier.clickable {  }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = stringResource(id = R.string.developer))

        }
    }
}





/*
@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(
        elevation = 10.dp,
        backgroundColor = Color(0xFF000000)


    ) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"", tint = Color.White)
        },
            label = { Text(
                text = "Home",
                color =  Color.White) },
            selected = (selectedIndex.value == 0), onClick = {

                navController.navigate(ROUTE_SEARCH) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.MoreVert,"",tint = Color.White)
        },
            label = { Text(
                text = "More",
                color =  Color.White) },
            selected = (selectedIndex.value == 1), onClick = {

                navController.navigate(ROUTE_VIEW_PROD) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "",tint = Color.White)
        },
            label = { Text(
                text = "Login",
                color =  Color.White) },
            selected = (selectedIndex.value == 2),
            onClick = {

                navController.navigate(ROUTE_LOGIN) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }

            })

    }
}
 */