package com.jt.rxjava.creation;

import rx.Observable;

public class ObservableCreation {
	public static void main(String[] args) {
		justCreation();
		letterObservableTest(lettersFromCreation());
		letterToUppercase(lettersFromCreation());
	}

	private static void justCreation() {
		Observable<String> observable = Observable.just("Hello");
		observable.subscribe(s -> System.out.println(s));
	}

	private static void letterToUppercase(Observable<String> input) {
		input.map(String::toUpperCase).subscribe(letter -> System.out.print(letter));
	}

	private static void letterObservableTest(Observable<String> input) {
		input.subscribe(i -> System.out.println(i), Throwable::printStackTrace,
				() -> System.out.println("Processning completed."));
	}

	private static Observable<String> lettersFromCreation() {
		String[] letters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l" };
		Observable<String> letterObservable = Observable.from(letters);
		return letterObservable;
	}
}
