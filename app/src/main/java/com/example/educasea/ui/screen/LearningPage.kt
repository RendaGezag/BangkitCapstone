package com.example.educasea.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.example.educasea.R
import com.example.educasea.ui.component.CategoryCard
import com.example.educasea.ui.component.SearchInput
import com.example.educasea.ui.model.BiotaViewModel
import com.example.educasea.ui.theme.Poppins

@Composable
fun LearningPage (
    vm: BiotaViewModel,
    modifier: Modifier = Modifier
) {
    LaunchedEffect(Unit , block = {
        vm.getBiotaList()
    })
    BoxWithConstraints(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column (
            modifier = Modifier.padding(10.dp, 10.dp)
        ) {
            Row (
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp, 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo_educasea),
                    contentDescription = "Logo",
                    modifier = Modifier.size(30.dp)
                )

                Text(
                    text = "EducaSea",
                    fontFamily = Poppins,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            SearchInput(label = "Cari")

            if (vm.errorMessage.isEmpty()) {
                Column (
                    modifier = Modifier.padding(0.dp, 10.dp, 0.dp, 0.dp)
                ) {
                    LazyColumn {
                        items(vm.biotaList) { biota ->
                            CategoryCard(
                                modifier = Modifier.padding(0.dp, 12.dp, 0.dp, 0.dp),
                                text = biota.name
                            )

                            Spacer(modifier = Modifier.height(10.dp))
                        }
                    }
                }
            } else {
                Text(text = vm.errorMessage)
            }
        }
    }
}

@Composable
@Preview
fun LearningPagePreview () {
    LearningPage(
        vm = BiotaViewModel()
    )
}