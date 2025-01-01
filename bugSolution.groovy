```groovy
def myMethod(Map params) {
  if (params) { // Check for null before iterating
    params.each { key, value ->
      println "$key: $value"
    }
  } else {
    println "The params Map is null"
  }
}

myMethod(null)
```