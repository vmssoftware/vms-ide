
export function VmsAbsoluteDateString(date: Date, locale: string = "en-US"): string {
    date = new Date(date.valueOf() + date.getTimezoneOffset() * 60 * 1000);
    const day = date.getDate().toString(10).padStart(2, "0");
    const year = date.getFullYear().toString(10);
    const hour = date.getHours().toString(10).padStart(2, "0");
    const minute = date.getMinutes().toString(10).padStart(2, "0");
    const sec = date.getSeconds().toString(10).padStart(2, "0");

    const f = new Intl.DateTimeFormat(locale, {month: "short"});
    const month = f.format(date);

    const dateString = `${day}-${month}-${year} ${hour}:${minute}:${sec}`;
    return dateString;
}
