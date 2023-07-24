
package com.company;

import com.company.entity.*;
import com.company.inter.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class TalentScoreApplication {

    private final EducationUserRepository educationUserRepository;
    private final UserRepository userRepository;
    private final EducationAnswerRepository educationAnswerRepository;
    private final EducationQuestionRepository educationQuestionRepository;

    public static void main(String[] args) {
        SpringApplication.run(TalentScoreApplication.class, args);
    }


    @Bean
    public CommandLineRunner run() {
        CommandLineRunner clr = new CommandLineRunner() {

            @Transactional
            @Override
            public void run(String... args) throws Exception {
                Integer userId = 1;
                Integer experienceQuestionId = 1;
                Integer experienceAnswerId = 1;
                Integer occupationQuestionId = 2;
                Integer occupationAnswerId = 5;
                Integer educationQuestionId = 3;
                Integer educationAnswerId = 9;
                Integer universityRateQuestionId = 4;
                Integer universityRateAnswerId = null;

                User user = userRepository.findById(userId).get();
                if (user != null) {

                    EducationUser userExperience = new EducationUser();
                    EducationUser userOccupation = new EducationUser();
                    EducationUser userEducation = new EducationUser();
                    EducationUser userUniversityRate = new EducationUser();

                    List<EducationUser> educationUserList = new ArrayList<>();

                    if (experienceAnswerId != null && experienceAnswerId != 0) {
                        EducationAnswer educationAnswerExperience = educationAnswerRepository.findById(experienceAnswerId).get();
                        userExperience.setEducationAnswerId(educationAnswerExperience);
                    }
                    if (experienceQuestionId != null && experienceQuestionId != 0) {
                        EducationQuestion educationQuestionExperience = educationQuestionRepository.findById(experienceQuestionId).get();
                        if (experienceAnswerId != null && experienceAnswerId != 0) {
                            userExperience.setUserId(user);
                            userExperience.setEducationQuestionId(educationQuestionExperience);
                            educationUserList.add(userExperience);
                        }
                    }

                    if (occupationAnswerId != null && occupationAnswerId != 0) {
                        EducationAnswer educationAnswerOccupation = educationAnswerRepository.findById(occupationAnswerId).get();
                        userOccupation.setEducationAnswerId(educationAnswerOccupation);
                    }

                    if (occupationQuestionId != null && occupationQuestionId != 0) {
                        EducationQuestion educationQuestionOccupation = educationQuestionRepository.findById(occupationQuestionId).get();

                        if (occupationAnswerId != null && occupationAnswerId != 0) {
                            userOccupation.setUserId(user);
                            userOccupation.setEducationQuestionId(educationQuestionOccupation);
                            educationUserList.add(userOccupation);
                        }
                    }

                    if (educationAnswerId != null && educationAnswerId != 0) {
                        EducationAnswer educationAnswerEducation = educationAnswerRepository.findById(educationAnswerId).get();
                        userEducation.setEducationAnswerId(educationAnswerEducation);
                    }

                    if (educationQuestionId != null && educationQuestionId != 0) {
                        EducationQuestion educationQuestionEducation = educationQuestionRepository.findById(educationQuestionId).get();

                        if (educationAnswerId != null && educationAnswerId != 0) {
                            userEducation.setUserId(user);
                            userEducation.setEducationQuestionId(educationQuestionEducation);
                            educationUserList.add(userEducation);
                        }
                    }

                    if (universityRateAnswerId != null && universityRateAnswerId != 0) {
                        EducationAnswer educationAnswerUniversityRate = educationAnswerRepository.findById(universityRateAnswerId).get();
                        userUniversityRate.setEducationAnswerId(educationAnswerUniversityRate);
                    }

                    if (universityRateQuestionId != null && universityRateQuestionId != 0) {
                        EducationQuestion educationQuestionUniversityRate = educationQuestionRepository.findById(universityRateQuestionId).get();
                        if (universityRateAnswerId != null && universityRateAnswerId != 0) {
                            userUniversityRate.setUserId(user);
                            userUniversityRate.setEducationQuestionId(educationQuestionUniversityRate);
                            educationUserList.add(userUniversityRate);
                        }
                    }


                    educationUserRepository.saveAll(educationUserList);
                    System.out.println("tamamlandi");
                }
            }
        };
        return clr;
    }
}