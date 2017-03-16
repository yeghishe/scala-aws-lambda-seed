scala-aws-lambda-seed
=========================

[![Build Status][build-status-badge]][build-status-url]
[![Code Quality][code-quality-badge]][code-quality-url]

[![Issues][issues-badge]][issues-url]

[![License][license-badge]][license-url]
[![Chat][chat-badge]][chat-url]

This is a seed project to create AWS Lambdas in Sala

## To create a new project run

```
activator new <YOUR PROJECT NAME> scala-aws-lambda-seed
```

## Overview
The project is intended to be used as an activator template to generate AWS Lambda projects.
From the command line, you can execute `activator new <YOUR PROJECT NAME> scala-aws-lambda-seed$` to generate a project. From activator UI find the template named `scala-aws-lambda-seed$` and generate your project using it.

Once the project is generated you get few things out of the box:
* [Config](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Config.scala) is handled using [Ficus](https://github.com/ceedubs/ficus). Make sure to create your case classes for new config values you add in typesafe config. You can later mix in `Config` trait or import your values from `Config` object.
* [Scalafmt](https://github.com/olafurpg/scalafmt) is being used for code formatting.
* [Scalastyle](http://www.scalastyle.org/) is being used fro code style checking.
* [Scoverage](https://github.com/scoverage/sbt-scoverage) is being used for code coverage .
* [Sbt Assembly](https://github.com/sbt/sbt-assembly) is being used for packaging.
* [Sbt S3](https://github.com/sbt/sbt-s3) is being used for deployment to S3.


[build-status-badge]: https://img.shields.io/travis/yeghishe/scala-aws-lambda-seed.svg?style=flat-square
[build-status-url]: https://travis-ci.org/yeghishe/scala-aws-lambda-seed
[code-quality-badge]: https://img.shields.io/codacy/07a7abfa2f134206a9e864a58d7759e2.svg?style=flat-square
[code-quality-url]: https://www.codacy.com/app/ypiruzyan/scala-aws-lambda-seed
[issues-badge]: https://img.shields.io/github/issues/yeghishe/scala-aws-lambda-seed.svg?style=flat-square
[issues-url]: https://github.com/yeghishe/scala-aws-lambda-seed/issues
[license-badge]: https://img.shields.io/badge/License-Apache%202-blue.svg?style=flat-square
[license-url]: LICENSE
[chat-badge]: https://img.shields.io/badge/gitter-join%20chat-brightgreen.svg?style=flat-square
[chat-url]: https://gitter.im/yeghishe/scala-aws-lambda-seed
