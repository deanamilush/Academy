package com.dean.academies.ui.academy.academy

import androidx.lifecycle.ViewModel
import com.dean.academies.data.CourseEntity
import com.dean.academies.utils.DataDummy

class AcademyViewModel : ViewModel() {

    fun getCourses(): List<CourseEntity> = DataDummy.generateDummyCourses()
}