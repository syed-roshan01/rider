.class public final Lq3/a;
.super Lq3/c;


# static fields
.field public static final b:Lq3/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq3/a;

    invoke-direct {v0}, Lq3/c;-><init>()V

    sput-object v0, Lq3/a;->b:Lq3/a;

    return-void
.end method


# virtual methods
.method public final a(Lq3/b;)Ljava/lang/Object;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Ld7/a;->m(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
