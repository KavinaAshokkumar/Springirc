package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class person {
        private int pid;
        private String pname;
        @JsonIgnore
        private String page;
        
        public person() {}

		public person(int pid, String pname, String page) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.page = page;
		}

		public int getPid() {
			return pid;
		}

		public void setPid(int pid) {
			this.pid = pid;
		}

		public String getPname() {
			return pname;
		}

		public void setPname(String pname) {
			this.pname = pname;
		}

		public String getPage() {
			return page;
		}

		public void setPage(String page) {
			this.page = page;
		}
        
       
}
