package com.example.questnavigasiui_045.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.questnavigasiui_045.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData(
    onBackBtnClick: () -> Unit,
){
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Welly"),
        Pair(stringResource(R.string.jenis_kelamin), "Lainnya"),
        Pair(stringResource(R.string.alamat), "Yogyakarta"),
    )

}
