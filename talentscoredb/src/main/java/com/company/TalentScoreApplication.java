
package com.company;

import com.company.entity.*;
import com.company.inter.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TalentScoreApplication {

//    @Autowired
//    private SportQuestionRepository sportQuestionRepository;
//    @Autowired
//    private SportAnswerRepository sportAnswerRepository;
//    @Autowired
//    private SportUserRepository sportUserRepository;
//    @Autowired
//    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(TalentScoreApplication.class, args);
    }


//    @Bean
//    public CommandLineRunner run() {
//        CommandLineRunner clr = new CommandLineRunner() {
//
//            @Transactional
//            @Override
//            public void run(String... args) throws Exception {
//
//                Integer sportQuestionId = 1;
//                Integer sportAnswerId = 2;
//                Integer whichSportQuestionId = 2;
//                Integer whichSportAnswerId = 3;
//                Integer winStage1QuestionId = 3;
//                Integer winStage1AnswerId = 5;
//                Integer whichPlace1QuestionId = 4;
//                Integer whichPlace1RateAnswerId = 6;
//                User user = userRepository.findById(1).get();
//                if (user != null) {
//                    SportUser userSport = new SportUser();
//                    SportUser userSportName = new SportUser();
//                    SportUser userStage1 = new SportUser();
//                    SportUser userPlace1 = new SportUser();
//                    List<SportUser> sportUserList = new ArrayList<>();
//
//                    if (sportAnswerId != null && sportAnswerId != 0) {
//                        SportAnswer sportAnswer = sportAnswerRepository.findById(sportAnswerId).get();
//                        userSport.setSportAnswerId(sportAnswer);
//                    }
//                    if (sportQuestionId != null && sportQuestionId != 0) {
//                        SportQuestion sportQuestion = sportQuestionRepository.findById(sportQuestionId).get();
//                        if (sportAnswerId != null && sportAnswerId != 0) {
//                            userSport.setUserId(user);
//                            userSport.setSportQuestionId(sportQuestion);
//                            sportUserList.add(userSport);
//                        }
//                    }
//
//                    if (whichSportAnswerId != null && whichSportAnswerId != 0) {
//                        SportAnswer sportAnswer = sportAnswerRepository.findById(whichSportAnswerId).get();
//                        userSportName.setSportAnswerId(sportAnswer);
//                    }
//
//                    if (whichSportQuestionId != null && whichSportQuestionId != 0) {
//                        SportQuestion sportQuestion = sportQuestionRepository.findById(whichSportQuestionId).get();
//
//                        if (whichSportAnswerId != null && whichSportAnswerId != 0) {
//                            userSportName.setUserId(user);
//                            userSportName.setSportQuestionId(sportQuestion);
//                            sportUserList.add(userSportName);
//                        }
//                    }
//
//                    if (winStage1AnswerId != null && winStage1AnswerId != 0) {
//                        SportAnswer sportAnswer = sportAnswerRepository.findById(winStage1AnswerId).get();
//                        userStage1.setSportAnswerId(sportAnswer);
//                    }
//
//                    if (winStage1QuestionId != null && winStage1QuestionId != 0) {
//                        SportQuestion sportQuestion = sportQuestionRepository.findById(winStage1QuestionId).get();
//
//                        if (winStage1AnswerId != null && winStage1AnswerId != 0) {
//                            userStage1.setUserId(user);
//                            userStage1.setSportQuestionId(sportQuestion);
//                            sportUserList.add(userStage1);
//                        }
//                    }
//
//                    if (whichPlace1RateAnswerId != null && whichPlace1RateAnswerId != 0) {
//                        SportAnswer sportAnswer = sportAnswerRepository.findById(whichPlace1RateAnswerId).get();
//                        userPlace1.setSportAnswerId(sportAnswer);
//                    }
//
//                    if (whichPlace1QuestionId != null && whichPlace1QuestionId != 0) {
//                        SportQuestion sportQuestion = sportQuestionRepository.findById(whichPlace1QuestionId).get();
//                        if (whichPlace1RateAnswerId != null && whichPlace1RateAnswerId != 0) {
//                            userPlace1.setUserId(user);
//                            userPlace1.setSportQuestionId(sportQuestion);
//                            sportUserList.add(userPlace1);
//                        }
//                    }
//
//                    sportUserRepository.saveAll(sportUserList);
//                }
//
//            }
//        };
//        return clr;
//    }
}