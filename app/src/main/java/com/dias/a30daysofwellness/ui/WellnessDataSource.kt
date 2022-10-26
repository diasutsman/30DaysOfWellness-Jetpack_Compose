package com.dias.a30daysofwellness.ui

import com.dias.a30daysofwellness.R
import com.dias.a30daysofwellness.ui.model.Wellness

object WellnessDataSource {
    val wellnesses = listOf(
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
        Wellness(
            summary = R.string.summary_1,
            imageRes = R.drawable.bg_1,
            description = R.string.description_1,
        ),
        Wellness(
            summary = R.string.summary_2,
            imageRes = R.drawable.bg_2,
            description = R.string.description_2,
        ),
    ).mapIndexed { index, wellness -> wellness.copy(day = index + 1) }
}