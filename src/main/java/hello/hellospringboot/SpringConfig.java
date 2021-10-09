package hello.hellospringboot;

import hello.hellospringboot.repository.MemberRepository;
import hello.hellospringboot.repository.MemoryMemberRepository;
import hello.hellospringboot.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
