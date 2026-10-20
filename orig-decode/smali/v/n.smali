.class public final Lv/n;
.super Ljava/lang/Object;


# static fields
.field public static final synthetic a:Lv/n;

.field public static final b:Lt/d1;

.field public static final c:Lv/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lv/n;->a:Lv/n;

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x7

    invoke-static {v0, v1, v2}, Lt/e;->r(FLjava/lang/Object;I)Lt/d1;

    move-result-object v0

    sput-object v0, Lv/n;->b:Lt/d1;

    new-instance v0, Lv/m;

    invoke-direct {v0}, Lv/m;-><init>()V

    sput-object v0, Lv/n;->c:Lv/m;

    return-void
.end method
