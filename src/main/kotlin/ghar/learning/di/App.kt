package ghar.learning.di

import ghar.learning.di.dependency.DaggerAppGraph
import ghar.learning.di.dependency.module.Kitchen
import javax.inject.Inject


class App {

    @Inject lateinit var kitchen : Kitchen

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            /** instantiate Dependency-GRAPH */
            val graph = DaggerAppGraph.create()
            graph.injectHouse()

        }
    }
}