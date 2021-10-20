using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab06_RemoteControl
{
    public partial class RemoteControl : Form
    {
        #region 4 Slots
        //Slot 1
        private ICommand Slot1ON = NoCommand.GetInstance();
        private ICommand Slot1OFF = NoCommand.GetInstance();
        //Slot 2
        private ICommand Slot2ON = NoCommand.GetInstance();
        private ICommand Slot2OFF = NoCommand.GetInstance();
        //Slot 3...
        #endregion


        #region 7 Devices
        //Light
        private Light light;
        private ICommand LightON;
        private ICommand LightOFF;

        //TV
        private TV tv;
        private ICommand TVON;
        private ICommand TVOFF;

        //Door
        private Door door;
        private ICommand DoorOn;
        private ICommand DoorOff;
        //Air conditioner

        //Fan

        //Main Door
        #endregion

        public RemoteControl()
        {
            InitializeComponent();

            //Light
            light = new Light(this.txtStatus1);
            LightON = new LightOn(light);
            LightOFF = new LightOff(light);

            //TV
            tv = new TV(this.btnTV);
            TVON = new TVOn(tv);
            TVOFF = new TVOff(tv);

            //Door ...
            door = new Door(this.pictureBoxDoor);
            DoorOn = new DoorON(door);
            DoorOff = new DoorOFF(door);

        }

        #region Slot 1 
        private void btnOn1_Click(object sender, EventArgs e)
        {
            Slot1ON.Execute();        
        }

        private void btnOFF1_Click(object sender, EventArgs e)
        {
            Slot1OFF.Execute();
        }

        private void cboSlot1_SelectedIndexChanged(object sender, EventArgs e)
        {
            String option = cboSlot1.SelectedItem.ToString();
            ChoiceDevice(option, 1);
        }
        #endregion

        #region Slot 2
        private void btnON2_Click(object sender, EventArgs e)
        {
            this.Slot2ON.Execute();
        }

        private void btnOFF2_Click(object sender, EventArgs e)
        {
            this.Slot2OFF.Execute();
        }

        private void cboSlot2_SelectedIndexChanged(object sender, EventArgs e)
        {
            String option = cboSlot2.SelectedItem.ToString();

            ChoiceDevice(option, 2);
        }
        #endregion


        private void AssignCommandOnOFF(String deviceName,  ref ICommand ONCmd, ref ICommand OFFCmd)
        {
            if (deviceName.Equals("Light"))
            {
                OFFCmd = LightOFF;
                ONCmd = LightON;
            }
            else if (deviceName.Equals("TV"))
            {
                OFFCmd = TVOFF;
                ONCmd = TVON;
            }
            else if (deviceName.Equals("None"))
            {
                OFFCmd = NoCommand.GetInstance();
                ONCmd = NoCommand.GetInstance();
            }
            else if (deviceName.Equals("Door"))
            {
                OFFCmd = DoorOff;
                ONCmd = DoorOn;
            }
        }
        private void ChoiceDevice(String deviceName, int slotNum)
        {
            if (slotNum == 1) //Slot 1
            {
                AssignCommandOnOFF(deviceName, ref Slot1ON, ref Slot1OFF);
            }
            else if(slotNum == 2) //Slot 2
            {
                AssignCommandOnOFF(deviceName, ref Slot2ON,  ref Slot2OFF);
            }
            // Slot 3...
        }
    }
}
