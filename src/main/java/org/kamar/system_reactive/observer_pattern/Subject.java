package org.kamar.system_reactive.observer_pattern;

/**
 * An interface representing a subject that can be observed by one or more observers.
 *
 * @param <T> the type of data that the subject holds.
 * @author <a href="https://github.com/kamarbaraka">samson baraka</a>.
 */
public interface Subject <T>{

    /**
     * Registers an observer to the subject.
     *
     * @param observer the observer to be registered.
     */
    void registerObserver(Observer<T> observer);
    void unRegisterObserver(Observer<T> observer);
    void notifyObservers();
}
