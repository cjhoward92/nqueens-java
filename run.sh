#!/bin/bash
set -e
mvn install
java -cp target/cjhoward92-nqueens-1.0-SNAPSHOT.jar com.cjhoward92.nqueens.App