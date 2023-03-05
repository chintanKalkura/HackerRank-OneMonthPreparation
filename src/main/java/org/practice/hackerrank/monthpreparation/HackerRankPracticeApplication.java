package org.practice.hackerrank.monthpreparation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HackerRankPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(HackerRankPracticeApplication.class, args);
    }
}

/* Essential and necessary:
Use git.
Build controllers.
    1. Create task(Will submit name of task with input).
    2. Start processing of task with given ID.
    3. Poll for result.
    4. Get result.
Use rx Java. For processing of given task.
Use Hibernate for storing the submitted task and then the result.
Acceptance and Unit tests.
Use redis for web request cache.
Dockerize.
Build a CICD pipeline. Use jenkins or Azure(based on free tier).
     1. Test Coverage.
     2. Automated versioning and publishing.
Deployment to kubernetes in AWS or Azure.
Load testing.
 */

/* Next level
Use generics
Build front end. Host it in a website. :-)
*/
