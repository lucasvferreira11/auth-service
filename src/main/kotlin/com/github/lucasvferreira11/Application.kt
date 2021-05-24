package com.github.lucasvferreira11

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.lucasvferreira11")
		.start()
}

