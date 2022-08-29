package ghar.learning.di

import ghar.learning.di.dependency.DaggerAppGraph


class App {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {

            /** instantiate Dependency-GRAPH */
            val graph = DaggerAppGraph.create()
            val house =  graph.injectHouse()
            val kitchen = graph.injectKitchen()

        }
    }
}