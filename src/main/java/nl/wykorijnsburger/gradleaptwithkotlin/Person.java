package nl.wykorijnsburger.gradleaptwithkotlin;

import org.immutables.value.Value;

@Value.Immutable
interface Person {
    String name();
}