package com.algar.adventofcode2018.day01

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class Part1 {

    private val input: String = Input.part1

    @Test
    fun calibrateFrequency() {
        val frequencyChange: List<Int> = input
            .split("\n")
            .map { it.toInt() }

        val answer = frequencyChange.sum()
        println("Answer: $answer")
    }
}