# A5_241A010591 – Lab A5

**Sinh viên:** Trần Tuấn Tú  
**MSSV:** 241A010591  
**Môn:** INT4211 – Lập trình trên các thiết bị di động

Ứng dụng **Danh bạ mini** thực hiện:
- 2 Activity, Intent tường minh và truyền `Contact` bằng `Parcelable`.
- Nhận kết quả bằng Activity Result API, xử lý `RESULT_OK` và `RESULT_CANCELED`.
- 3 Intent ngầm định: gọi điện (`ACTION_DIAL`), mở web (`ACTION_VIEW`), chia sẻ (`ACTION_SEND`).
- Bẫy `ActivityNotFoundException`.
- Log đầy đủ callback vòng đời với tag `A5_241A010591`.
- Nâng cao NC3: hiệu ứng chuyển màn hình.
- Nâng cao NC4: nhận văn bản chia sẻ từ ứng dụng khác (`ACTION_SEND`, `text/plain`).

## Chạy bài
Mở thư mục bằng Android Studio, chờ Gradle Sync, chọn máy ảo/thiết bị API 24+ và Run.

## Demo cần quay
Nhập liên hệ → Xem chi tiết → sửa tên → Lưu & quay lại → thử Gọi → Chia sẻ. Video tối đa 2 phút.

## Logcat
Lọc: `tag:A5_241A010591`. Chụp kịch bản 1 và 4 để chèn vào báo cáo.
