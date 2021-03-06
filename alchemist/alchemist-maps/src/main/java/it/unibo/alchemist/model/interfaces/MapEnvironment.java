/*
 * Copyright (C) 2010-2014, Danilo Pianini and contributors
 * listed in the project's pom.xml file.
 * 
 * This file is part of Alchemist, and is distributed under the terms of
 * the GNU General Public License, with a linking exception, as described
 * in the file LICENSE in the Alchemist distribution's top directory.
 */
package it.unibo.alchemist.model.interfaces;

/**
 * @param <T>
 */
public interface MapEnvironment<T> extends BenchmarkableEnvironment<T> {

    /**
     * The default vehicle.
     */
    Vehicle DEFAULT_VEHICLE = Vehicle.FOOT;

    /**
     * This method relies on the map data, and computes a route towards some
     * absolute coordinate solving a TSP problem. It's up to the specific
     * {@link Action} calling this method to effectively move nodes along the
     * path. It uses the fastest path as metric.
     * 
     * @param node
     *            The start node
     * @param node2
     *            the second node's position will be used as destination
     * @return A {@link Route} object describing the path the node should
     *         follow
     */
    Route<GeoPosition> computeRoute(Node<T> node, Node<T> node2);

    /**
     * This method relies on the map data, and computes a route towards some
     * absolute coordinate solving a TSP problem. It's up to the specific
     * {@link Action} calling this method to effectively move nodes along the
     * path.
     * 
     * @param node
     *            The {@link Node} to move
     * @param coord
     *            The absolute coordinate where this node wants to move to
     * @return A {@link Route} object describing the path the node should
     *         follow
     */
    Route<GeoPosition> computeRoute(Node<T> node, Position coord);

    /**
     * This method relies on the map data, and computes a route towards some
     * absolute coordinate solving a TSP problem. It's up to the specific
     * {@link Action} calling this method to effectively move nodes along the
     * path.
     * 
     * @param node
     *            The {@link Node} to move
     * @param coord
     *            The absolute coordinate where this node wants to move to
     * @param vehicle
     *            The vehicle tipe for this route
     * @return A {@link Route} object describing the path the node should
     *         follow
     */
    Route<GeoPosition> computeRoute(Node<T> node, Position coord, Vehicle vehicle);

    /**
     * This method relies on the map data, and computes a route towards some
     * absolute coordinate solving a TSP problem. It's up to the specific
     * {@link Action} calling this method to effectively move nodes along the
     * path.
     * 
     * @param p1
     *            start position
     * 
     * @param p2
     *            end position The absolute coordinate where this node wants to
     *            move to
     * @return A {@link Route} object describing the path the node should
     *         follow
     */
    Route<GeoPosition> computeRoute(Position p1, Position p2);

    /**
     * This method relies on the map data, and computes a route towards some
     * absolute coordinate solving a TSP problem. It's up to the specific
     * {@link Action} calling this method to effectively move nodes along the
     * path.
     * 
     * @param p1
     *            start position
     * 
     * @param p2
     *            end position The absolute coordinate where this node wants to
     *            move to
     * @param vehicle
     *            vehicle to use. Different vehicles may use different paths,
     *            e.g. pedestrians can't go along a highway, but can walk the
     *            parks
     * @return A {@link Route} object describing the path the node should
     *         follow
     */
    Route<GeoPosition> computeRoute(Position p1, Position p2, Vehicle vehicle);

    @Override
    GeoPosition getPosition(Node<T> node);

    @Override
    GeoPosition makePosition(Number... coordinates);
}
