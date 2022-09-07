package ghar.learning.di

import ghar.learning.di.dependency.DaggerAppGraph


fun main() {

    /** instantiate Dependency-GRAPH */
    val graph = DaggerAppGraph.create()
    graph.injectHouse()

}

