# xplane-java

Java connection to X-Plane via UDP

Forked from https://github.com/spainer/xplane-java to collect patches on interim branches:

* **`fork_merged` (this branch) combines all patches**
* `fix/msgtype` fixes message type ID length (protocol zero-termination was not present on my system)
* `fix/rref` fully reads RREF responses (was cut short on my system)
* `improvement/publish` adds source and JavaDoc packaging for artifact handling/publishing
* `improvement/java8` backports the library to be compatible to Java 8
    * `improvement/java8_rref` makes the backport compatible with `fix/rref` changes

Merge requests will be created on the upstream project in due time.
