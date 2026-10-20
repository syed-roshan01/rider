.class public final Lc5/v;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# static fields
.field public static final a:Lc5/v;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lc5/v;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ld9/j;-><init>(I)V

    sput-object v0, Lc5/v;->a:Lc5/v;

    return-void
.end method


# virtual methods
.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lq8/l;->a:Lq8/l;

    return-object v0
.end method
