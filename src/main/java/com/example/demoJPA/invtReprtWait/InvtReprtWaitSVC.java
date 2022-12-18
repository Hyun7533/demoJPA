package com.example.demoJPA.invtReprtWait;

import com.example.demoJPA.invtReprtErr.InvtReprtErr;
import com.example.demoJPA.invtReprtWaitErr.InvtReprtWaitErr;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class InvtReprtWaitSVC {

    private final InvtReprtWaitREPO invtReprtWaitREPO;


    public Long save(List<?> data) {

        Long result = 0L;

        // 임시보고서 저장
        invtReprtWaitREPO.saveWaitData((InvtReprtWait) data.get(0));

        // 보고서 오류검증 ...
        List<HashMap<String, String>> reprtData = (List<HashMap<String, String>>) data.get(1);

        // 에러 터질시
        errSave("에러내용", "임의적오류");

        return result;
    }

    public void errSave(String cn, String knd) {
        invtReprtWaitREPO.saveErr(cn, knd);
    }
}
