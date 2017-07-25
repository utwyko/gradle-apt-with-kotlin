# Gradle APT plugin with Kotlin

This is an example project showing that the [Gradle APT plugin](https://github.com/tbroyer/gradle-apt-plugin) does not work well yet when Kotlin relies on generated classes based off Java classes with annotations.

### Testing 

* Run `gw build`, build should be successful
* Uncomment lines 5-11 in `ImmutablesInKotlin.kt` 
* Run `gw build`, build now fails