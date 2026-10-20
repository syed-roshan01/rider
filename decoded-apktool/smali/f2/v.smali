.class public final Lf2/v;
.super Ljava/lang/Object;

# interfaces
.implements Lf2/w;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/v;->a:Ljava/lang/Object;

    iput-boolean p2, p0, Lf2/v;->b:Z

    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lf2/v;->a:Ljava/lang/Object;

    return-object v0
.end method
