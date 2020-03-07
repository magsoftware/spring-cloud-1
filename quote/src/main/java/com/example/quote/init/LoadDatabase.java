package com.example.quote.init;

import com.example.quote.model.Quote;
import com.example.quote.repository.QuoteRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * LoadDatabase
 */
@Component
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(QuoteRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Quote("Few are those who see with their own eyes and feel with their own hearts.")));
            log.info("Preloading " + repository.save(new Quote("Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.")));
            log.info("Preloading " + repository.save(new Quote("Few are those who see with their own eyes and feel with their own hearts.")));
            log.info("Preloading " + repository.save(new Quote("Imagination is more important than knowledge. Knowledge is limited. Imagination encircles the world.")));
            log.info("Preloading " + repository.save(new Quote("Unthinking respect for authority is the greatest enemy of truth.")));
            log.info("Preloading " + repository.save(new Quote("Try not to become a man of success, but rather try to become a man of value.")));
            log.info("Preloading " + repository.save(new Quote("I am by heritage a Jew, by citizenship a Swiss, and by makeup a human being, and only a human being, without any special attachment to any state or national entity whatsoever.")));
            log.info("Preloading " + repository.save(new Quote("Great spirits have always encountered violent opposition from mediocre minds.")));
            log.info("Preloading " + repository.save(new Quote("I would teach peace rather than war. I would inculcate love rather than hate.")));
            log.info("Preloading " + repository.save(new Quote("I believe in intuitions and inspirations. I sometimes feel that I am right. I do not know that I am.")));
            log.info("Preloading " + repository.save(new Quote("Look deep into nature, and then you will understand everything better.")));
            log.info("Preloading " + repository.save(new Quote("All religions, arts and sciences are branches of the same tree.")));
            log.info("Preloading " + repository.save(new Quote("A hundred times every day I remind myself that my inner and outer life are based on the labors of other men, living and dead, and that I must exert myself in order to give in the same measure as I have received and am still receiving.")));
            log.info("Preloading " + repository.save(new Quote("A man should look for what is, and not for what he thinks should be.")));
            log.info("Preloading " + repository.save(new Quote("The most beautiful experience we can have is the mysterious.")));
            log.info("Preloading " + repository.save(new Quote("I believe in standardizing automobiles. I do not believe in standardizing human beings.")));
            log.info("Preloading " + repository.save(new Quote("It is, in fact, nothing short of a miracle that the modern methods of instruction have not yet entirely strangled the holy curiosity of inquiry")));
            log.info("Preloading " + repository.save(new Quote("A table, a chair, a bowl of fruit and a violin; what else does a man need to be happy?")));
            log.info("Preloading " + repository.save(new Quote("A human being is part of a whole called by us Universe.")));
            log.info("Preloading " + repository.save(new Quote("The important thing is to not stop questioning. Curiosity has its own reason for existing.")));
            log.info("Preloading " + repository.save(new Quote("A question that sometimes drives me hazy — am I or are the others crazy?")));
            log.info("Preloading " + repository.save(new Quote("The world is in greater peril from those who tolerate or encourage evil than from those who actually commit it")));
            log.info("Preloading " + repository.save(new Quote("Life is like riding a bicycle. To keep your balance you must keep moving.")));
            log.info("Preloading " + repository.save(new Quote("Concern for man and his fate must always form the chief interest of all technical endeavors. Never forget this in the midst of your diagrams and equations.")));
            log.info("Preloading " + repository.save(new Quote("I love to travel, but I hate to arrive.")));
            log.info("Preloading " + repository.save(new Quote("All that is valuable in human society depends upon the opportunity for development accorded the individual.")));
            log.info("Preloading " + repository.save(new Quote("The important thing is not to stop questioning. Curiosity has its own reason for existence.")));
            log.info("Preloading " + repository.save(new Quote("Although I am a typical loner in daily life, my consciousness of belonging to the invisible community of those who strive for truth, beauty, and justice has preserved me from feeling isolated.")));
            log.info("Preloading " + repository.save(new Quote("The years of anxious searching in the dark, with their intense longing, their alternations of confidence and exhaustion, and final emergence into light—only those who have experienced it can understand that.")));
            log.info("Preloading " + repository.save(new Quote("Let us not forget that human knowledge and skills alone cannot lead humanity to a happy and dignified life")));
            log.info("Preloading " + repository.save(new Quote("He who can no longer pause to wonder and stand rapt in awe, is as good as dead; his eyes are closed.")));
            log.info("Preloading " + repository.save(new Quote("I have no special talent. I am only passionately curious.")));
            log.info("Preloading " + repository.save(new Quote("Invention is not the product of logical thought, even though the final product is tied to a logical structure.")));
            log.info("Preloading " + repository.save(new Quote("Science can flourish only in an atmosphere of free speech.")));
            log.info("Preloading " + repository.save(new Quote("Hail to the man who went through life always helping others, knowing no fear, and to whom aggressiveness and resentment are alien")));
            log.info("Preloading " + repository.save(new Quote("A happy man is too satisfied with the present to dwell too much on the future.")));
            log.info("Preloading " + repository.save(new Quote("I speak to everyone in the same way, whether he is the garbage man or the president of the university.")));
            log.info("Preloading " + repository.save(new Quote("Man would indeed be in a poor way if he had to be restrained by fear of punishment and hopes of reward after death.")));
            log.info("Preloading " + repository.save(new Quote("The great moral teachers of humanity were, in a way, artistic geniuses in the art of living.")));
            log.info("Preloading " + repository.save(new Quote("Out yonder there was this huge world, which exists independently of us human beings and which stands before us like a great, eternal riddle, at least partially accessible to our inspection and thinking. The contemplation of this world beckoned like a liberation...")));
        };
    }
}
