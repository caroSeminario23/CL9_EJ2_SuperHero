package com.example.superhero.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superhero.R

data class SuperHero(
    @StringRes val nameRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes: Int
)

