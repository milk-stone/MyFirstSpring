package MyFirstSpring.hellospring;

import MyFirstSpring.hellospring.repository.MemberRepository;
import MyFirstSpring.hellospring.repository.MemoryMemberRepository;
import MyFirstSpring.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
