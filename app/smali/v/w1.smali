.class public final Lv/w1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final a:Lv/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv/w1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lv/w1;->a:Lv/w1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object v0
.end method
