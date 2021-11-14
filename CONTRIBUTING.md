# Contributing Guidelines

This project aims to create a common source from all Mathematics questions on HackerRank and values every single 
contribution made by the community.

We aim to solve all questions in the HackerRank Mathematics domain in as many languages as possible to show the 
different code styles and approaches that can be used to solve the same problem.
 
Contributing is very simple, simply identify a question from the [README](README.md) file that has yet to be solved in
a programming language of your choice. 

Solve that question and make sure that all tests pass on HackerRank and then create a pull request with the 
added solution and updated readme.
  
## Pull Request Process

1. Fork this repository to your github account and then clone your forked repository to your machine.
2. Say you solve some problem called __cars-and-trucks__ in the _Number Theory_ sub domain on 
    HackerRank using your favorite programming language, say Python then simple add a new file called 
    `cars-and-trucks.py` in the `python/number-theory` directory. 
3. In the [README](README.md) file, add a Python logo along with an empty link.
4. Updating the link for the solution will be done by the Project maintainers (aka. 
[anishLearnsToCode](https://github.com/anishLearnsToCode))

## Programming Language Logos
To add a logo in the [README](README.md) table simply add a link with an embedded picture as 
```markdown
[![Python](icon-link)](this link will be filled by the author if the pull request is accepted)
```

For the icon link refer to the table below to obtain the link for a specific programming language:

| Programming Language | Icon | Icon Link|
|:--------------------:|:----:|:----:|
| Java | ![Java](https://img.icons8.com/color/40/000000/java-coffee-cup-logo.png) | https://img.icons8.com/color/40/000000/java-coffee-cup-logo.png |
| Python | ![Python](https://img.icons8.com/color/35/000000/python.png) | https://img.icons8.com/color/35/000000/python.png |
| C | ![C](https://img.icons8.com/color/35/000000/c-programming.png) | https://img.icons8.com/color/35/000000/c-programming.png |
| C++ | ![C++](https://img.icons8.com/color/35/000000/c-plus-plus-logo.png) | https://img.icons8.com/color/35/000000/c-plus-plus-logo.png |
| C# | ![C#](https://img.icons8.com/color/35/000000/c-sharp-logo.png) | https://img.icons8.com/color/35/000000/c-sharp-logo.png |
| JavaScript | ![JavaScript](https://img.icons8.com/color/40/000000/javascript.png) | https://img.icons8.com/color/40/000000/javascript.png |
| TypeScript | ![TypeScript](https://img.icons8.com/color/40/000000/typescript.png) | https://img.icons8.com/color/40/000000/typescript.png |
| Ruby | ![Ruby](https://img.icons8.com/office/35/000000/ruby-programming-language.png) | https://img.icons8.com/office/35/000000/ruby-programming-language.png |
| Scala | ![Scala](https://img.icons8.com/dusk/35/000000/scala.png) | https://img.icons8.com/office/35/000000/ruby-programming-language.png |
| PGH | ![PHP](https://img.icons8.com/officel/40/000000/php-logo.png) | https://img.icons8.com/officel/40/000000/php-logo.png |
| Swift | ![Swift](https://img.icons8.com/fluent/40/000000/swift.png) | https://img.icons8.com/fluent/40/000000/swift.png |

## Git Workflow
1. Fork this repo

2. Add this repo as the remote:
````bash
git remote add anish https://github.com/anishLearnsToCode/hackerrank-math.git
git remote 
````

3. Always pull main from this repo and program in new branches:
````bash
git checkout main 
git pull anish main
git push origin main
git checkout -b new-feature
```` 

4. Push your new branch onto your repo and create a Pull Request from GitHub 
````bash
git push -u origin new-feature
````
and create a pull request

5. Update __main__ branch once the PR is approved and rebase any other feature branches on top of it.
````bash
git checkout main
git pull anish main
git checkout feature-2
git rebase main
```` 
