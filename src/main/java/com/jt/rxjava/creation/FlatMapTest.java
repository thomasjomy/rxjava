package com.jt.rxjava.creation;

import rx.Observable;

public class FlatMapTest {
	private static Observable<String> buildBookTitleObservable() {
		Observable<String> bookTitle = Observable.just("Book1", "Book2", "Book3");
		return bookTitle;
	}

	private static Observable<String> getTitle(String title) {
		Observable<String> titleObservable = null;
		if (title.equals("Book1")) {
			titleObservable = Observable.just("1");
		} else if (title.equals("Book2")) {
			titleObservable = Observable.just("2");
		} else {
			titleObservable = Observable.just("3");
		}
		return titleObservable;
	}

	private static void testFlatMap(Observable<String> input) {
		input.flatMap(s -> getTitle(s)).subscribe(result -> System.out.println(result));
	}

	public static void main(String[] args) {
		testFlatMap(buildBookTitleObservable());
	}
}
