package app.controller;


import app.dto.AirConditionerParams;
import app.dto.DetailRecord;
import app.entity.User;
import app.entity.bill;
import app.service.AirConditionerService;
import app.service.BillService;
import app.service.ManagerService;
import app.service.ServiceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

//前台服务人员
@RestController
@RequestMapping("/receptionist")
public class ReceptionistController {

    @Autowired
    private AirConditionerService airConditionerService;
    @Autowired
    private ServiceDetailService serviceDetailService;
    @Autowired
    private BillService billService;

    @PostMapping("/adduser")
    /*  接收参数 房客的手机号码
        返回参数 User
     */
    public User checkInCustomer(String phoneNumber) {
        //前台增加用户，需要房客的手机号码，返回房客房间空调系统的密码
        //如果房间满，返回空对象
        return airConditionerService.checkInCustom(phoneNumber);
    }

    @GetMapping("/createrdr")
    public DetailRecord createRDR(@RequestParam(value="roomid") int roomId,
                                  @RequestParam(value="starttime") String startTime,
                                  @RequestParam(value="stopttime") String stopTime) {
        return serviceDetailService.
                selectByRoomIdAndTime(roomId,startTime,stopTime);
    }


    @GetMapping("/createinvoice")
    public bill CreateInvoice(@RequestParam(value="roomid") int roomId,
                              @RequestParam(value="starttime") String startTime,
                              @RequestParam(value="stopttime") String stopTime) {

        return billService.selectByRoomIdAndTime(roomId,startTime,stopTime);
    }

}
