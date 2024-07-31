package step02.onetoonejoin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

@Getter
@Setter
@ToString

@SequenceGenerator(name = "team_seq", sequenceName = "team_seq_id",
				   initialValue = 1, allocationSize = 50)
/*
 * 해당 entity에 적용되는 sequence 를 생성 및 적용 의미
 * - name = "team_seq" : sequence 명
 * 		: sequence 를 entity 상에서 활용하고자 하는 설정 이름 부여
 * 		: @GeneratedValue 라는 애노테이션의 generator 속성이 참조하는 이름 설정
 * 
 * - sequenceName = "team_seq_id" : db에 생성되는 sequence 명 
 * - allocationSize = 50
 * 		: 한번에 50개 할당 (생성) 해 놓겠다는 의미
 * 		: insert시에 sequence 생성이 아닌 사전에 50개 만들어 놓고 배정
 * 			실행 속도 고려한 action
 */
//@Entity
public class Team2 {
	// strategy = GenerationTye.SEQUENCE : oracle seq
	// strategy = GenerationTye.IDENTITY : mysql autoincrement
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_seq")
	@Column(name = "team_id")
	private long teamId;
	
	@NonNull
	@Column(name="team_name", length = 20)
	private String teamName;
	
	
	
}
